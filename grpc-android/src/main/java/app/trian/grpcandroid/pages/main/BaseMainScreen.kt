package app.trian.grpcandroid.pages.main

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import app.trian.grpcandroid.ui.theme.RecipeTheme

@Composable
fun BaseMainScreen(
    content:@Composable ()->Unit={}
){
    Scaffold(
        bottomBar = {

        },
        content = {
            content.invoke()
        }
    )
}
@Preview
@Composable
fun PreviewBaseMainScreen(){
    RecipeTheme {
        BaseMainScreen()
    }
}