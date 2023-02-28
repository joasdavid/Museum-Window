package com.joasvpereira.museumwindow.ui.mokeup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.MuseumWindowTheme
import com.joasvpereira.museumwindow.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WelcomeScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.secondaryContainer
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    //.align(Alignment.CenterStart)
                    .fillMaxWidth(.75f)
                    .fillMaxHeight()
                    .padding(start = 20.dp)
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "Welcome to",
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = "Museum\n     Window",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(25.dp))
                Text(
                    text = "your window to the best museum art from your cellphone."
                )
                Spacer(modifier = Modifier.weight(2f))
            }


                Image(
                    painter = painterResource(id = R.drawable.m1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.offset(100.dp, 0.dp)
                        .fillMaxHeight(.5f)
                        .width(200.dp)
                        .clip(shape = MaterialTheme.shapes.medium)
                        .background(
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                        )
                        .align(Alignment.CenterEnd)
                )

            Button(onClick = { },
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(20.dp),
                shape = MaterialTheme.shapes.small
            ) {
                Text(text = "Start browsing")
            }
        }
    }
}

@Preview
@Composable
private fun WelcomeScreenPreview() {
    MuseumWindowTheme() {
        WelcomeScreen()
    }
}