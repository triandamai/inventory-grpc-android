package app.trian.grpcandroid.pages.main.profile

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.grpcandroid.pages.main.BaseMainScreen
import app.trian.grpcandroid.ui.theme.RecipeTheme

const val PROFILE = "PROFILE"

fun NavGraphBuilder.routeProfile(){
    composable(PROFILE){
        ProfileScreen()
    }
}

@Composable
fun ProfileScreen(){
    BaseMainScreen(
        content = {}
    )
}

@Preview
@Composable
fun PreviewProfileScreen(){
    RecipeTheme {
        ProfileScreen()
    }
}