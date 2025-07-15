package com.makecents.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.makecents.app.ui.theme.*

@Composable
fun WelcomeScreen(
    onNextClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        BackgroundLight,
                        White
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Spacer(modifier = Modifier.height(80.dp))
            
            // Logo and Title Section
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(32.dp)
            ) {
                // Logo placeholder - MC symbol
                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .background(
                            brush = Brush.linearGradient(
                                colors = listOf(GradientStart, GradientEnd)
                            ),
                            shape = RoundedCornerShape(24.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "MC",
                        color = White,
                        fontSize = 48.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                
                // App Title
                Text(
                    text = "Make Cents",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryBlue,
                    textAlign = TextAlign.Center
                )
                
                // Subtitle
                Text(
                    text = "Budget Smarter, Live Better –\nAnytime, Anywhere.",
                    fontSize = 16.sp,
                    color = TextLight,
                    textAlign = TextAlign.Center,
                    lineHeight = 24.sp
                )
            }
            
            Spacer(modifier = Modifier.weight(1f))
            
            // Bottom wave design and next button
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                // Wave background
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    GradientStart.copy(alpha = 0.1f),
                                    GradientEnd.copy(alpha = 0.3f)
                                )
                            ),
                            shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp)
                        )
                )
                
                // Next button
                FloatingActionButton(
                    onClick = onNextClick,
                    modifier = Modifier
                        .size(64.dp)
                        .offset(y = (-20).dp),
                    containerColor = PrimaryBlue,
                    contentColor = White
                ) {
                    Text(
                        text = "→",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}
