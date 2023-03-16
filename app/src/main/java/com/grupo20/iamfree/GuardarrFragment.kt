package com.grupo20.iamfree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.grupo20.iamfree.databinding.FragmentGuardarrBinding
import com.grupo20.iamfree.databinding.FragmentThirdBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [GuardarrFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GuardarrFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentGuardarrBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGuardarrBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.butBack7.setOnClickListener {
            findNavController().navigate(R.id.action_guardarrFragment_to_grabar2Fragment)
        }
        binding.butGuardar3.setOnClickListener {
            binding.mensaje3.setText("Nota guardada X");
            binding.mensaje3.setVisibility(View.VISIBLE);
        }

        binding.mensaje3.setOnClickListener {

            binding.mensaje3.setVisibility(View.INVISIBLE);
        }

        binding.butPlay1.setOnClickListener {
            findNavController().navigate(R.id.action_guardarrFragment_to_fileFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}