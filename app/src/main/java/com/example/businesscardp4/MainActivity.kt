package com.example.businesscardp4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardp4.ui.theme.BusinessCardP4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardP4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    Greeting()
                    Greeting2()
                    LogoInsert()
                    ImageInsert()

                }
            }
        }
    }
}
@Composable
fun Greeting2() {
    Column(verticalArrangement = Arrangement.spacedBy(2.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
        val image = painterResource(id = R.drawable.android_logo)
        Image(
            painter = image, contentDescription = null,
            modifier = Modifier
                .size(210.dp)
                .padding(top = 50.dp)
        )
        Text(text ="Debaditya Ghosh", fontSize = 47.sp, color = Color.White
        )
        Text(text ="Android Dev ", fontSize = 35.sp, fontWeight = FontWeight.Bold, color = Color(0xff3DDC84)
        )

    }
}
@Composable
fun Greeting() {
    Column(
        verticalArrangement = Arrangement.Bottom,
    modifier = Modifier
        .fillMaxWidth()
        .background(Color(7, 48, 66)))
        {


            Text(text ="+91 9883107560", fontSize=23.sp,fontWeight= FontWeight.Bold,color= Color(0xff3DDC84),

                modifier = Modifier

                    .padding( top = 10.dp, bottom = 15.dp, start=90.dp))



            Text(text ="@debadityaghoshbatman", fontSize=23.sp,fontWeight= FontWeight.Bold,color= Color(0xff3DDC84),
                modifier = Modifier

                    .padding( top = 10.dp, bottom = 15.dp,start=90.dp)
            )
            Text(text ="ghoshdebaditya25@gmail.com", fontSize=21.sp,fontWeight= FontWeight.Bold,color= Color(0xff3DDC84),
                modifier = Modifier

                    .padding( top = 10.dp, bottom = 25.dp,start=90.dp)
            )

    }
}
@Composable
fun LogoInsert() {
    Column(horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Bottom
    ){
        Icon(Icons.Rounded.Call ,contentDescription = null , Modifier.padding(top=20.dp,bottom=12.dp,start=35.dp), tint = Color(255,166,245))

        Icon(Icons.Rounded.Info ,contentDescription = null , Modifier.padding(top=20.dp,bottom=9.dp,start=35.dp), tint = Color(255,166,255))

        Icon(Icons.Rounded.Email ,contentDescription = null , Modifier.padding(top=20.dp,bottom=25.dp,start=35.dp), tint = Color(255,166,255))
    }

}

@Composable
fun ImageInsert() {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        
        ){
        val image= painterResource(id = R.drawable.profilepic)
        Image(painter = image,contentDescription = null,contentScale=ContentScale.FillWidth,
            modifier= Modifier.size(140.dp).clip(CircleShape)
                .border(width = 4.dp,  Color(255,166,245), shape = CircleShape))

    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardP4Theme {
        Greeting()
        Greeting2()
        LogoInsert()
        ImageInsert()


    }
}