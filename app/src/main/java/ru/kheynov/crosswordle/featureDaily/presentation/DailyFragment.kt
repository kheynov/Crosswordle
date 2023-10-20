package ru.kheynov.crosswordle.featureDaily.presentation

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import ru.kheynov.crosswordle.R
import ru.kheynov.crosswordle.appComponent
import javax.inject.Inject

class DailyFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: DailyScreenViewModel by viewModels { viewModelFactory }

    private lateinit var navController: NavController

    override fun onAttach(context: Context) {
        super.onAttach(context)
        context.appComponent.dailyScreenComponent().create().inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_daily, container, false).apply {
            findViewById<ComposeView>(R.id.composeDailyView).setContent {
//                val state = viewModel.state.collectAsStateWithLifecycle()
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
    }
}