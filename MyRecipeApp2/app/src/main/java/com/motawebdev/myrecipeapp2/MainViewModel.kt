package com.motawebdev.myrecipeapp2

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel : ViewModel() {

    private val _categorieState = mutableStateOf(RecipeState())
//    val categoriesState: State<RecipeState> = _categorieState

    init {
//        fetchCategories()
        fillWithDummyData()
    }

    fun fillWithDummyData() {
        _categorieState.value = _categorieState.value.copy(
            list = listOf(
                Category(
                    idCategory = "1",
                    strCategory = "Beef",
                    strCategoryThumb = "https://www.themealdb.com/images/category/beef.png",
                    strCategoryDescription = "Beef is the culinary name for meat from cattle."
                ),
                Category(
                    idCategory = "2",
                    strCategory = "Chicken",
                    strCategoryThumb = "https://www.themealdb.com/images/category/chicken.png",
                    strCategoryDescription = "Chicken is a type of domesticated fowl."
                )
            ),
            loading = false,
            error = null
        )
    }


//    private fun fetchCategories(){
//        viewModelScope.launch {
//            try {
//                val response = recipeService.getCategories()
//                _categorieState.value = _categorieState.value.copy(
//                    list = response.categories,
//                    loading = false,
//                    error = null
//                )
//
//            }catch (e: Exception){
//                _categorieState.value = _categorieState.value.copy(
//                    loading = false,
//                    error = "Error fetching Categories ${e.message}"
//                )
//            }
//        }
//    }

    data class RecipeState(
        val loading: Boolean = true,
        val list: List<Category> = emptyList(),
        val error: String? = null
    )

}