package br.edu.up.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.edu.up.app.databinding.FragmentTerceiroBinding

class TerceiroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTerceiroBinding.inflate(layoutInflater)

        binding.btnVoltar.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.btnQuarto.setOnClickListener {
            val action = TerceiroFragmentDirections.actionTerceiroToQuarto()
            findNavController().navigate(action)
        }

        return binding.root
    }
}