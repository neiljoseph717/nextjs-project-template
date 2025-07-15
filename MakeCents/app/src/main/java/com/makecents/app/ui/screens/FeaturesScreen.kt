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
fun FeaturesScreen(
    onGetStartedClick: () -> Unit
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
            Spacer(modifier = Modifier.height(40.dp))
            
            // Header Section
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                // Small logo
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .background(
                            brush = Brush.linearGradient(
                                colors = listOf(GradientStart, GradientEnd)
                            ),
                            shape = RoundedCornerShape(16.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "MC",
                        color = White,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                
                Text(
                    text = "Make It Make Cents!",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryBlue,
                    textAlign = TextAlign.Center
                )
            }
            
            // Features Section
            Column(
                verticalArrangement = Arrangement.spacedBy(24.dp),
                modifier = Modifier.padding(vertical = 32.dp)
            ) {
                FeatureItem(
                    icon = "📊",
                    title = "See Where Your Money Goes",
                    description = "Visualize spending by category with beautiful charts."
                )
                
                FeatureItem(
                    icon = "💡",
                    title = "Smarter Budgeting",
                    description = "Set budgets and get helpful insights to stay on track."
                )
                
                FeatureItem(
                    icon = "🎯",
                    title = "Reach your goals!",
                    description = "Success in your goals by tracking and monitoring it financially!"
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
                
                // Get Started button
                FloatingActionButton(
                    onClick = onGetStartedClick,
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

@Composable
fun FeatureItem(
    icon: String,
    title: String,
    description: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Icon container
        Box(
            modifier = Modifier
                .size(48.dp)
                .background(
                    color = LightBlue.copy(alpha = 0.2f),
                    shape = CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = icon,
                fontSize = 20.sp
            )
        }
        
        // Text content
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = title,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = PrimaryBlue
            )
            Text(
                text = description,
                fontSize = 14.sp,
                color = TextLight,
                lineHeight = 20.sp
            )
        }
    }
}
