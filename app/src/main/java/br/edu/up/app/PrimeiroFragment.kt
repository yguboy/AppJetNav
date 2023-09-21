package br.edu.up.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.edu.up.app.databinding.FragmentPrimeiroBinding

class PrimeiroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentPrimeiroBinding.inflate(layoutInflater)
        return binding.root
    }

}