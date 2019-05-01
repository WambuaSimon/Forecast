package com.wizag.forecast.ui.weather.future.list

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wizag.forecast.R

class FutureListWeatherFragment : Fragment() {

    private var mViewModel: FutureListWeatherViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.future_list_weather_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProviders.of(this).get(FutureListWeatherViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {

        fun newInstance(): FutureListWeatherFragment {
            return FutureListWeatherFragment()
        }
    }

}
