package com.jarvis.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)
                            setContent {
                                            JarvisAppTheme {
                                                                ChatScreen()
                                            }
                            }
        }
}

@Composable
fun ChatScreen() {
        // Ekhane Chat er message gulo thakbe
            var messageText by remember { mutableStateOf("") }
                var chatHistory by remember { mutableStateOf(listOf("Jarvis: Hello! Ami tomar AI assistant.")) }

                    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
                                // Message List
                                        LazyColumn(modifier = Modifier.weight(1f)) {
                                                        items(chatHistory) { message ->
                                                                        Card(
                                                                                                modifier = Modifier.padding(vertical = 4.dp).fillMaxWidth(),
                                                                                                                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
                                                                        ) {
                                                                                                Text(text = message, modifier = Modifier.padding(16.dp))
                                                                        }
                                                        }
                                        }

                                                // Input Box Area
                                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                                                        TextField(
                                                                                            value = messageText,
                                                                                                            onValueChange = { messageText = it },
                                                                                                                            modifier = Modifier.weight(1f),
                                                                                                                                            placeholder = { Text("Type a message...") }
                                                                        )
                                                                                    Spacer(modifier = Modifier.width(8.dp))
                                                                                                Button(onClick = {
                                                                                                                    if (messageText.isNotEmpty()) {
                                                                                                                                            // Nije message add koro
                                                                                                                                                                chatHistory = chatHistory + "You: $messageText"
                                                                                                                                                                                    // Fake AI reply (Pore asol AI bosabo)
                                                                                                                                                                                                        chatHistory = chatHistory + "Jarvis: Ekhon ami shudhu demo, pore amar brain lagano hobe!"
                                                                                                                                                                                                                            messageText = ""
                                                                                                                    }
                                                                                                }) {
                                                                                                                    Text("Send")
                                                                                                }
                                                        }
                    }
}

@Composable
fun JarvisAppTheme(content: @Composable () -> Unit) {
        MaterialTheme(content = content)
}
}
                                                                                                }
                                                                                                                    }
                                                                                                })
                                                                        )
                                                        }
                                                                        }
                                                                        )}
                                        }
                    }
}
                                            }
                            }
        }
}