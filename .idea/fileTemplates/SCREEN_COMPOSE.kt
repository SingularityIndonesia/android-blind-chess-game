#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
import androidx.compose.runtime.Composable
import androidx.compose.material3.Surface
import androidx.compose.runtime.Immutable
import androidx.compose.ui.tooling.preview.Preview
import com.storema.theme.StoremaAdminTheme

#parse("File Header.java")

interface ${NAME} {
    @Immutable
    data class Payload(
        // event
        var goBack: () -> Unit = {},

        // data source
    )

    /** do not edit companion **/
    companion object {
        @Composable
        operator fun invoke(
            payload: Payload
        ) {
            Content(payload)
        }
    }
}

@Composable
private fun Content(
    payload: ${NAME}.Payload
) {

    /** your code here **/
}


@Composable
@Preview(showBackground = true)
private fun Preview() {
    StoremaAdminTheme {
        Surface {
            Content(
                ${NAME}.Payload()
            )
        }
    }
}