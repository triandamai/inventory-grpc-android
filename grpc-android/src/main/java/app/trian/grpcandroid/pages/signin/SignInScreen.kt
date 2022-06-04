package app.trian.grpcandroid.pages.signin

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.grpcandroid.ui.theme.RecipeTheme

const val SIGN_IN = "SIGN_IN"

fun NavGraphBuilder.routeSignIn(){
    composable(SIGN_IN){
        SignInScreen()
    }
}

@Composable
fun SignInScreen(){

}

@Preview
@Composable
fun PreviewSignIn(){
    RecipeTheme {
        SignInScreen()
    }
}