package com.grupo20.iamfree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.grupo20.iamfree.databinding.FragmentFirstBinding
import com.grupo20.iamfree.databinding.FragmentPantallaBinding

class PantallaFragment : Fragment() {
    private var _binding: FragmentPantallaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentPantallaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       binding.butBack4.setOnClickListener {
           findNavController().navigate(R.id.action_pantallaFragment_to_FirstFragment)
       }

        binding.butSaveN.setOnClickListener {
            binding.mensaje5.setText("Nota guardada X");
            binding.mensaje5.setVisibility(View.VISIBLE);
        }

        binding.mensaje5.setOnClickListener {

            binding.mensaje5.setVisibility(View.INVISIBLE);
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}