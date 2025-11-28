package com.jaamcoding.apigames.ui.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri

@Composable
fun MetaWebsite(url: String) {
    val context = LocalContext.current
    val intent = Intent(Intent.ACTION_VIEW, url.toUri())
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "METASCORE",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
        )
        Button(
            onClick = { context.startActivity(intent) },
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Gray
            )
        ) {
            Text(text = "Website")
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun MetaWebsitePrev() {
    MetaWebsite("METAWEBSITE")
}