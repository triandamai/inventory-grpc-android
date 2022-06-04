package app.trian.grpcandroid.pages.resetpassword

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.grpcandroid.ui.theme.RecipeTheme

const val RESET_PASSWORD = "RESET_PASSWORD"

fun NavGraphBuilder.routeResetPassword(){
    composable(RESET_PASSWORD){
        ResetPasswordScreen()
    }
}

@Composable
fun ResetPasswordScreen(){

}

@Preview
@Composable
fun PreviewResetPasswordScreen(){
    RecipeTheme {
        ResetPasswordScreen()
    }
}