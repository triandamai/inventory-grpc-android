package app.trian.grpcandroid.pages.signup

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.grpcandroid.pages.signin.SignInScreen
import app.trian.grpcandroid.ui.theme.RecipeTheme

const val SIGN_UP = "SIGN_UP"

fun NavGraphBuilder.routeSignUp(){
    composable(SIGN_UP){
        SignUpScreen()
    }
}

@Composable
fun SignUpScreen(){

}

@Preview
@Composable
fun PreviewSignUp(){
    RecipeTheme {
        SignInScreen()
    }
}