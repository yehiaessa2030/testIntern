package com.example.training

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.training.ui.theme.TrainingTheme

class ComposeActivity : ComponentActivity() {

    private val viewModel by viewModels<ComposeViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrainingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(
                        checked = viewModel.checked.value,
                        onCheckChanged = {
                            viewModel.changeCheckedState(it)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(
    modifier: Modifier = Modifier,
    checked: Boolean,
    onCheckChanged: (Boolean) -> Unit
) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Checkbox(
            checked = checked,
            onCheckedChange = {
                onCheckChanged(it)
            },
            modifier = Modifier.fillMaxWidth()
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterStart),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(all = 10.dp)
                    .height(20.dp)
                    .clickable { },
                verticalArrangement = Arrangement.Center
            ) {
                Row {
                    Row {
                        Column {

                        }
                    }
                }
            }
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "tadsfdsafdsaf")
        }
        IconButton(onClick = { /*TODO*/ }) {

        }
    }
    Text(
        text = stringResource(R.string.this_is_demo_text_to_be_added_to_string),
        modifier = modifier
    )
}

@Composable
fun SelectableComponent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Image(imageVector = Icons.Default.Phone, contentDescription = "call phone")
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "01232132132")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TrainingTheme {
//        Greeting()
    }
}