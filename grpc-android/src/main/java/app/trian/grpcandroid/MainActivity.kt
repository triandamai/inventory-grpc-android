package app.trian.grpcandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import app.trian.grpcandroid.pages.main.home.HOME
import app.trian.grpcandroid.pages.main.home.routeHome
import app.trian.grpcandroid.pages.main.profile.routeProfile
import app.trian.grpcandroid.pages.resetpassword.routeResetPassword
import app.trian.grpcandroid.pages.signin.routeSignIn
import app.trian.grpcandroid.pages.signup.routeSignUp
import app.trian.grpcandroid.pages.splashscreen.SPLASH_SCREEN
import app.trian.grpcandroid.pages.splashscreen.routeSplashScreen
import app.trian.grpcandroid.pages.upload.routeUpload
import app.trian.grpcandroid.ui.theme.RecipeTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val router = rememberNavController()
                    NavHost(navController = router, startDestination = SPLASH_SCREEN){
                        routeSplashScreen()
                        routeSignIn()
                        routeSignUp()
                        routeResetPassword()
                        navigation(startDestination = HOME,route="MAIN"){
                            routeHome()
                            routeProfile()
                        }
                        routeUpload()

                    }
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}

