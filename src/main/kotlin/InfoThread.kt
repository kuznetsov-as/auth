import com.github.kittinunf.fuel.core.extensions.authentication
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.httpPost

class InfoThread: Thread() {
    var info: String? = null

    override fun run() {
//        while (true) {
//            val (request, response, result) = "https://geek-jokes.sameerkumar.website/api?format=json"
//                .httpGet()
//                .responseString()
//            info = result.get()
//            sleep(10000)
//
//        }

        while (true) {
            val (request, response, result) = "https://geek-jokes.sameerkumar.website/api?format=json".httpPost()
                .authentication().basic("admin", "1234")
                .responseString()
        }
    }
}