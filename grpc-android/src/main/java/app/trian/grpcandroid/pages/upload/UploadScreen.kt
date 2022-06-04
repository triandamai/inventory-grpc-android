package app.trian.grpcandroid.pages.upload

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.grpcandroid.ui.theme.RecipeTheme

const val UPLOAD = "UPLOAD"

fun NavGraphBuilder.routeUpload(){
    composable(UPLOAD){
        UploadScreen()
    }
}

@Composable
fun UploadScreen(){

}
@Preview
@Composable
fun PreviewUploadScreen(){
    RecipeTheme {
        UploadScreen()
    }
}