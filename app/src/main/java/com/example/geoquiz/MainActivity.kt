package com.example.geoquiz

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.geoquiz.ui.theme.GeoQuizTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GeoQuizTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { unuesd ->

                }
            }
        }

        class QuizElement
        {
            var Question = "DEFAULT_QUESTION"
            var IsCorrect = false;

            constructor(question: String, isCorrect: Boolean)
            {
                this.Question = question;
                this.IsCorrect = isCorrect;
            }
        };

        class DataBank{
            var QuizList: MutableList<QuizElement> = mutableListOf();

            constructor()
            {
                QuizList.add(QuizElement("Canberra is the capital of Australia.", true));
                QuizList.add(QuizElement("The Pacific Ocean is larger than the Atlantic Ocean. ", true));
                QuizList.add(QuizElement("The Suez Canal connects the Red Sea and the Indian Ocean.", false));
                QuizList.add(QuizElement("The source of the Nile River is in Egypt. ", false));
                QuizList.add(QuizElement("The Amazon River is the longest river in the Americas.", true));
                QuizList.add(QuizElement("Lake Baikal is the world's oldest and deepest freshwater lake.", true));
            }
        }


    }
}

