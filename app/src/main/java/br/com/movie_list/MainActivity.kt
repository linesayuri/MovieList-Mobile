package br.com.movie_list

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.movie_list.ui.theme.MovieListTheme

class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.tela_home)

            val btnsair : Button = findViewById(R.id.btn_sair)

            btnsair.setOnClickListener{
                val intent = Intent(this,TelaLogin::class.java)
                startActivity(intent)
            }

            val btnpopular : Button = findViewById(R.id.btn_popular)

                btnpopular.setOnClickListener{
                    val intent = Intent(this,TelaEmAlta::class.java)
                    startActivity(intent)
                }

            val btnaclamados : Button = findViewById(R.id.btn_aclamados)

                    btnaclamados.setOnClickListener{
                        val intent = Intent(this,TelaMaisBemAvaliados::class.java)
                        startActivity(intent)
                    }

            val btnporvir : Button = findViewById(R.id.btn_porvir)

                        btnporvir.setOnClickListener{
                            val intent = Intent(this,TelaPorVir::class.java)
                            startActivity(intent)

            }



        setContent {
            MovieListTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

//CHECAR!!
val client = OkHttpClient()

val request = Request.Builder()
    .url("https://api.themoviedb.org/3/authentication")
    .get()
    .addHeader("accept", "application/json")
    .build()

val response = client.newCall(request).execute()


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MovieListTheme {
        Greeting("Android")
    }
}