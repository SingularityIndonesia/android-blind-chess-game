#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
import androidx.activity.compose.BackHandler
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.storema.exceptions.companion.ResultCancel

#parse("File Header.java")

@Composable
fun ${NAME}(
    onReturn: (Result<Unit>) -> Unit
) {
    val navController = rememberNavController()

    BackHandler {
        if (!navController.popBackStack()) {
            onReturn.invoke(
                ResultCancel()
            )
        }
    }

    NavHost(
        navController = navController,
        startDestination = "start"
    ) {
        composable(
            route = "start",
            enterTransition = { slideInAnimation },
            exitTransition = { slideOutAnimation },
            popEnterTransition = { popEnterAnim },
            popExitTransition = { popExitAnim }
        ) {
            Text("Start")
        }
    }
}