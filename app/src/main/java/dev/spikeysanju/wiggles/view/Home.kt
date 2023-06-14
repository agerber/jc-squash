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
package dev.spikeysanju.wiggles.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import dev.spikeysanju.wiggles.component.ItemPlayerCard
import dev.spikeysanju.wiggles.component.TopBar
import dev.spikeysanju.wiggles.model.Player

@Composable
fun Home(navController: NavHostController, playerList: List<Player>) {


    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()) {
        var checked by remember {
            mutableStateOf(true)
        }
        TopBar(
            checked,
            onToggle = {
                checked = it
            }
        )
        val players = remember(checked) {
            derivedStateOf {
                playerList
                    .filter { if (checked) it.gender == "Men" else it.gender == "Women" }
                    .sortedBy { it.rank }
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        LazyColumn {
            items(players.value) {
                ItemPlayerCard(
                    it,
                    onItemClicked = { player ->
                        navController.navigate("details/${player.id}/${player.name}/${player.born}")
                    }
                )
            }
        }
    }


}
