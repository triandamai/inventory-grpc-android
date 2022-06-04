package app.trian.grpcandroid.pages.main.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.grpcandroid.pages.main.BaseMainScreen
import app.trian.grpcandroid.ui.theme.RecipeTheme

const val HOME="HOME"

fun NavGraphBuilder.routeHome(){
    composable(HOME){
        HomeScreen()
    }
}

@Composable
fun HomeScreen(){
    BaseMainScreen(
        content = {}
    )
}

@Preview
@Composable
fun PreviewHomeScreen(){
    RecipeTheme {
        HomeScreen()
    }
}