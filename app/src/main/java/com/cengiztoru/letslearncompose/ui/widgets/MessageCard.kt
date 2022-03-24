package com.cengiztoru.letslearncompose.ui.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cengiztoru.letslearncompose.R
import com.cengiztoru.letslearncompose.data.model.Message

@Composable
fun MessageCard(msg: Message) {
    Row(
        modifier = Modifier
            .padding(8.dp)
            .border(0.dp, Color.Transparent)
            .padding(8.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.baby),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .border(2.dp, MaterialTheme.colors.secondary, CircleShape),
            contentScale = ContentScale.FillHeight,
        )

        // Add a horizontal space between the image and the column
        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(
                text = msg.author,
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2
            )
            Spacer(modifier = Modifier.height(8.dp))

            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = MaterialTheme.shapes.medium,
                elevation = 10.dp,
                border = BorderStroke(0.dp, MaterialTheme.colors.secondary)
            ) {
                Text(
                    text = msg.body, modifier = Modifier.padding(16.dp), style = MaterialTheme.typography.body2
                )
            }
        }
    }
}


@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(Message("Cengiz", "Hi folks 👋"))
}
