package ir.evareh.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import ir.evareh.navgraphtest.R
import kotlinx.android.synthetic.main.fragment_splash.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val options = navOptions {
            anim {
                enter = android.R.anim.slide_in_left
                exit = android.R.anim.slide_out_right
                popEnter = android.R.anim.slide_in_left
                popExit = android.R.anim.slide_out_right
            }

            popUpTo(R.id.action_splashFragment_to_introFragment) {
                this.inclusive = true
            }
        }


        gotoIntro.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_introFragment, null, options)
        }

    }


}
