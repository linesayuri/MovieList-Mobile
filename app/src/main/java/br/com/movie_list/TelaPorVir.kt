package br.com.movie_list

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.movie_list.ui.theme.MovieListTheme


class TelaPorVir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_porvir)


        val btnvoltar : Button = findViewById(R.id.btn_voltar)

        btnvoltar.setOnClickListener{
            val intent = Intent(this,TelaHome::class.java)
            startActivity(intent)
        }
    }
}