package app.trian.grpcandroid.pages.splashscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.grpcandroid.ui.theme.RecipeTheme

const val SPLASH_SCREEN= "SPLASH_SCREEN"

fun NavGraphBuilder.routeSplashScreen(){
    composable(SPLASH_SCREEN){
        SplashScreen()
    }
}

@Composable
fun SplashScreen(
    modifier: Modifier=Modifier
){
    Column(
        modifier = modifier.fillMaxWidth()
    ) {

    }
}

@Preview
@Composable
fun PreviewScreen(){
    RecipeTheme {
        SplashScreen()
    }
}