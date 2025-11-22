package com.example.aithaker.ui.screens.athkar

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.aithaker.domain.model.AthkarCategory
import com.example.aithaker.ui.components.AthkarCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AthkarListScreen(
    category: String,
    viewModel: AthkarListViewModel = hiltViewModel(),
    onAthkarClick: (String) -> Unit = {},
    onBackClick: () -> Unit = {}
) {
    val state by viewModel.state.collectAsState()
    
    val categoryEnum = try {
        AthkarCategory.valueOf(category)
    } catch (e: Exception) {
        null
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { 
                    Text(categoryEnum?.displayNameAr ?: category)
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "رجوع"
                        )
                    }
                }
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            when {
                state.isLoading -> {
                    CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                
                state.error != null -> {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.errorContainer
                        )
                    ) {
                        Text(
                            text = state.error ?: "",
                            modifier = Modifier.padding(16.dp),
                            color = MaterialTheme.colorScheme.onErrorContainer
                        )
                    }
                }
                
                state.athkarList.isEmpty() -> {
                    Text(
                        text = "لا توجد أذكار في هذه الفئة",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(16.dp),
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                
                else -> {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(state.athkarList) { athkar ->
                            AthkarCard(
                                athkar = athkar,
                                onClick = { onAthkarClick(athkar.id) },
                                onFavoriteClick = {
                                    viewModel.toggleFavorite(athkar.id, athkar.isFavorite)
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}
