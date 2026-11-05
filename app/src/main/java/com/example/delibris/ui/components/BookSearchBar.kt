package com.example.delibris.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.PlainTooltip
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.SearchBarValue
import androidx.compose.material3.Text
import androidx.compose.material3.TooltipAnchorPosition
import androidx.compose.material3.TooltipBox
import androidx.compose.material3.TooltipDefaults
import androidx.compose.material3.rememberSearchBarState
import androidx.compose.material3.rememberTooltipState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.delibris.R
import com.example.delibris.ui.theme.IvorySurface
import com.example.delibris.ui.theme.OutlineSoft
import com.example.delibris.ui.theme.Terracotta
import com.example.delibris.ui.theme.TextPrimary
import com.example.delibris.ui.theme.TextSecondary
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookSearchBar(
    modifier: Modifier = Modifier
){
    val searchBarState = rememberSearchBarState(initialValue = SearchBarValue.Collapsed)
    val textField = rememberTextFieldState()
    val scope = rememberCoroutineScope()
    val searchShape = RoundedCornerShape(8.dp)
    val searchColors = SearchBarDefaults.colors(
        containerColor = IvorySurface,
        inputFieldColors = SearchBarDefaults.inputFieldColors(
            focusedContainerColor = IvorySurface,
            unfocusedContainerColor = IvorySurface,
            focusedTextColor = TextPrimary,
            unfocusedTextColor = TextPrimary,
            focusedPlaceholderColor = TextSecondary,
            unfocusedPlaceholderColor = TextSecondary,
            focusedLeadingIconColor = TextPrimary,
            unfocusedLeadingIconColor = TextPrimary,
            focusedTrailingIconColor = TextSecondary,
            unfocusedTrailingIconColor = TextSecondary,
            cursorColor = Terracotta
        )
    )

    val inputField  = @Composable {
        SearchBarDefaults.InputField(
            modifier = Modifier,
            searchBarState = searchBarState,
            textFieldState = textField,
            shape = searchShape,
            colors = searchColors.inputFieldColors,
            onSearch = { scope.launch { searchBarState.animateToCollapsed() } },
            placeholder = { Text(stringResource(R.string.search_bar_placeHolder)) },
            leadingIcon = {
                if (searchBarState.currentValue == SearchBarValue.Expanded){
                    TooltipBox(
                        modifier = Modifier,
                        positionProvider = TooltipDefaults.rememberTooltipPositionProvider(
                            TooltipAnchorPosition.Above
                        ),
                        tooltip = { PlainTooltip { Text("Back") } },
                        state = rememberTooltipState()

                    ) {
                        IconButton(onClick = { scope.launch {  searchBarState.animateToCollapsed()} }) {
                            Icon(
                                Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Arrow Back")
                        }
                    }
                } else{
                    Icon(Icons.Default.Search, contentDescription = "Search")
                }
            },
            trailingIcon = { Icon(Icons.Default.MoreVert, contentDescription = null) }
        )
    }

    Box(modifier = modifier) {
        SearchBar(
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, OutlineSoft, searchShape),
            shape = searchShape,
            colors = searchColors,
            state = searchBarState,
            inputField = inputField
        )
    }
}

