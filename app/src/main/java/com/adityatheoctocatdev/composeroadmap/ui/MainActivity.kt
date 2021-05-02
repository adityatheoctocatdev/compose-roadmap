package com.adityatheoctocatdev.composeroadmap.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adityatheoctocatdev.composeroadmap.R
import com.adityatheoctocatdev.composeroadmap.ui.theme.ThemeAppearance.ComposeRoadmapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeRoadmapTheme {
                this.RowExample()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun ColumnExample() {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFF2F2F2))
        ) {
            items(count = 1) {
                Image(
                    painter = painterResource(id = R.drawable.happy_meal_small),
                    contentDescription = null,
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop
                )
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Happy Meal", style = TextStyle(fontSize = 26.sp))
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "800 Calories", style = TextStyle(fontSize = 17.sp))
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "$5.99",
                        style = TextStyle(fontSize = 17.sp, color = Color(0xFF85BB65))
                    )
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun RowExample() {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFF2F2F2))
        ) {
            items(count = 1) {
                Image(
                    painter = painterResource(id = R.drawable.happy_meal_small),
                    contentDescription = null,
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop
                )
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Happy Meal", style = TextStyle(fontSize = 26.sp))
                        Text(
                            text = "$5.99",
                            style = TextStyle(fontSize = 17.sp, color = Color(0xFF85BB65)),
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "800 Calories", style = TextStyle(fontSize = 17.sp))
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Button(onClick = {}, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                        Text(text = "Order Now")
                    }
                }
            }
        }
    }
}
