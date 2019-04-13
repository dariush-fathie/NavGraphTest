package ir.evareh.navgraphtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val novHost = navHostFragment as NavHostFragment

    }


    override fun onNavigateUp(): Boolean {
        return findNavController(this, R.id.navHostFragment).navigateUp()
    }


}
