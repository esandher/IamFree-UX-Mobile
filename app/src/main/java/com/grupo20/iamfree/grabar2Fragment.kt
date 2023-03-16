package com.grupo20.iamfree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.grupo20.iamfree.databinding.FragmentGrabar2Binding
import com.grupo20.iamfree.databinding.FragmentThirdBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [grabar2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class grabar2Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentGrabar2Binding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGrabar2Binding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.butBack6.setOnClickListener {
            findNavController().navigate(R.id.action_grabar2Fragment_to_thirdFragment)
        }

        binding.butG.setOnClickListener {
            findNavController().navigate(R.id.action_grabar2Fragment_to_guardarrFragment)
        }

        binding.butEliminar2.setOnClickListener {
            binding.mensaje.setText("Nota eliminada X");
            binding.mensaje.setVisibility(View.VISIBLE);
        }

        binding.butPausa2.setOnClickListener {
            binding.mensaje.setText("Nota pausada X");
            binding.mensaje.setVisibility(View.VISIBLE);
        }

        binding.mensaje.setOnClickListener {
            binding.mensaje.setVisibility(View.INVISIBLE);
        }



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}