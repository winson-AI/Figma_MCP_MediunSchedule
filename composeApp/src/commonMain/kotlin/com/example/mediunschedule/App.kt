package com.example.mediunschedule

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import mediunschedule.composeapp.generated.resources.Res
import mediunschedule.composeapp.generated.resources.avatar_dr_babe
import mediunschedule.composeapp.generated.resources.avatar_dr_bessie
import mediunschedule.composeapp.generated.resources.avatar_dr_joseph
import mediunschedule.composeapp.generated.resources.ic_calendar_2
import mediunschedule.composeapp.generated.resources.ic_clock
import mediunschedule.composeapp.generated.resources.ic_calendar_bold
import mediunschedule.composeapp.generated.resources.ic_home_outline
import mediunschedule.composeapp.generated.resources.ic_message_outline
import mediunschedule.composeapp.generated.resources.ic_profile_outline
import mediunschedule.composeapp.generated.resources.ic_search

@Composable
@Preview
fun App() {
    MediunScheduleTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            ScheduleScreen()
        }
    }
}

@Composable
private fun ScheduleScreen() {
        Column(
            modifier = Modifier
            .fillMaxSize()
                .safeContentPadding()
            .background(Color(0xFFFFFFFF))
            .padding(horizontal = 24.dp)
    ) {
        StatusBar()
        //TopBar()
        //Spacer(modifier = Modifier.height(20.dp))
        ScheduleTabs()
        Spacer(modifier = Modifier.height(24.dp))
        ScheduleCard(
            name = "Dr. Joseph Brostito",
            title = "Dental Specialist",
            dateText = "Sunday, 12 June",
            timeText = "11:00 - 12:00 AM"
        )
        Spacer(modifier = Modifier.height(16.dp))
        ScheduleCard(
            name = "Dr. Bessie Coleman",
            title = "Dental Specialist",
            dateText = "Sunday, 12 June",
            timeText = "11:00 - 12:00 AM"
        )
        Spacer(modifier = Modifier.height(16.dp))
        ScheduleCard(
            name = "Dr. Babe Didrikson",
            title = "Dental Specialist",
            dateText = "Sunday, 12 June",
            timeText = "11:00 - 12:00 AM"
        )
        Spacer(modifier = Modifier.height(20.dp))
        Spacer(modifier = Modifier.height(20.dp))
        BottomNav()
        Spacer(modifier = Modifier.height(12.dp))
    }
}

@Composable
private fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Schedule",
            color = Color(0xFF0D1B34),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = painterResource(Res.drawable.ic_search),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
private fun StatusBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(44.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "9:41",
            color = Color(0xFF000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold
        )
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(1.dp), verticalAlignment = Alignment.Bottom) {
                Box(Modifier.width(3.dp).height(4.dp).background(Color(0xFF000000), RoundedCornerShape(1.dp)))
                Box(Modifier.width(3.dp).height(6.dp).background(Color(0xFF000000), RoundedCornerShape(1.dp)))
                Box(Modifier.width(3.dp).height(8.dp).background(Color(0xFF000000), RoundedCornerShape(1.dp)))
                Box(Modifier.width(3.dp).height(10.dp).background(Color(0xFF000000), RoundedCornerShape(1.dp)))
            }
            Column(verticalArrangement = Arrangement.spacedBy(1.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Box(Modifier.width(14.dp).height(2.dp).background(Color(0xFF000000), RoundedCornerShape(1.dp)))
                Box(Modifier.width(10.dp).height(2.dp).background(Color(0xFF000000), RoundedCornerShape(1.dp)))
                Box(Modifier.width(6.dp).height(2.dp).background(Color(0xFF000000), RoundedCornerShape(1.dp)))
            }
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(1.dp)) {
                Box(
                    Modifier
                        .width(22.dp)
                        .height(11.dp)
                        .border(1.dp, Color(0xFF000000), RoundedCornerShape(2.dp))
                )
                Box(
                    Modifier
                        .width(2.dp)
                        .height(4.dp)
                        .background(Color(0xFF000000), RoundedCornerShape(1.dp))
                )
            }
        }
    }
}

@Composable
private fun ScheduleTabs() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        TabPill(
            text = "Canceled Schedule",
            background = Color(0xFFFAFAFA),
            contentColor = Color(0xFF8696BB),
            modifier = Modifier.weight(1f))
        TabPill(
            text = "Upcoming schedule",
            background = Color(0x1A63B4FF), // 10% opacity of #63B4FF
            contentColor = Color(0xFF4894FE)
        )
        TabPill(
            text = "Completed schedule",
            background = Color(0xFFFAFAFA),
            contentColor = Color(0xFF8696BB),
            modifier = Modifier.weight(1f))
    }
}

@Composable
private fun TabPill(
    text: String,
    background: Color,
    contentColor: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(background, RoundedCornerShape(100))
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        Text(text = text, color = contentColor, fontSize = 14.sp, fontWeight = FontWeight.Medium, maxLines = 1, overflow = TextOverflow.Ellipsis)
    }
}

@Composable
private fun ScheduleCard(
    name: String,
    title: String,
    dateText: String,
    timeText: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFFFFF), RoundedCornerShape(12.dp))
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            val avatarPainter = runCatching {
                when (name) {
                    "Dr. Joseph Brostito" -> painterResource(Res.drawable.avatar_dr_joseph)
                    "Dr. Bessie Coleman" -> painterResource(Res.drawable.avatar_dr_bessie)
                    "Dr. Babe Didrikson" -> painterResource(Res.drawable.avatar_dr_babe)
                    else -> painterResource(Res.drawable.avatar_dr_joseph)
                }
            }.getOrElse {
                // Safe fallback in case the avatar resource is missing or invalid at runtime
                painterResource(Res.drawable.ic_profile_outline)
            }
            Image(
                painter = avatarPainter,
                contentDescription = null,
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .border(0.5.dp, Color(0x11000000), CircleShape)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text = name, color = Color(0xFF0D1B34), fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = title, color = Color(0xFF8696BB), fontSize = 14.sp, fontWeight = FontWeight.Normal)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(Res.drawable.ic_calendar_2), contentDescription = null, modifier = Modifier.size(16.dp))
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = dateText, color = Color(0xFF8696BB), fontSize = 12.sp)
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(Res.drawable.ic_clock), contentDescription = null, modifier = Modifier.size(16.dp))
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = timeText, color = Color(0xFF8696BB), fontSize = 12.sp)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0x1A63B4FF), RoundedCornerShape(100))
                .padding(vertical = 10.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Detail", color = Color(0xFF4894FE), fontSize = 14.sp, fontWeight = FontWeight.Medium)
        }
    }
}


@Composable
private fun BottomNav() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFFFFF)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Box(
            modifier = Modifier
                .width(58.dp)
                .height(48.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(Res.drawable.ic_home_outline), contentDescription = null, modifier = Modifier.size(24.dp))
        }

        Row(
            modifier = Modifier
                .width(116.dp)
                .height(48.dp)
                .background(Color(0x1A63B4FF), RoundedCornerShape(12.dp))
                .padding(horizontal = 12.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(Res.drawable.ic_calendar_bold), contentDescription = null, modifier = Modifier.size(24.dp))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Schedule", color = Color(0xFF63B4FF), fontSize = 14.sp, fontWeight = FontWeight.Bold)
        }

        Box(
            modifier = Modifier
                .width(58.dp)
                .height(48.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(Res.drawable.ic_message_outline), contentDescription = null, modifier = Modifier.size(24.dp))
        }

        Box(
            modifier = Modifier
                .width(58.dp)
                .weight(1f)
                .height(48.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(Res.drawable.ic_profile_outline), contentDescription = null, modifier = Modifier.size(24.dp))
        }
    }
}

