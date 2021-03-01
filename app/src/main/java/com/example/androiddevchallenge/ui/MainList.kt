/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.data.Animal

@Composable
fun MainList(data: List<Animal>, callback: (Animal) -> Unit) {
    LazyColumn {
        itemsIndexed(data) { index, animal ->
            Row(
                Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .background(Color.White)
                    .clickable {
                        callback.invoke(data[index])
                    }
            ) {
                Image(
                    ImageBitmap.Companion.imageResource(animal.avatarResId),
                    contentDescription = animal.name,
                    Modifier
                        .size(60.dp)
                        .clip(RoundedCornerShape(10.dp))
                )

                Column(
                    Modifier
                        .fillMaxHeight()
                        .padding(8.dp)
                ) {
                    Text(text = animal.name, fontSize = 20.sp)
                    Text(
                        text = animal.desc,
                        fontSize = 16.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

            // last
            if (index != data.size - 1) {
                Divider()
            }
        }
    }
}
