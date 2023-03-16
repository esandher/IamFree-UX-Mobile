package com.grupo20.iamfree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.grupo20.iamfree.databinding.FragmentEliminarBinding
import com.grupo20.iamfree.databinding.FragmentThirdBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class EliminarFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentEliminarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentEliminarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.butBack3.setOnClickListener {
            findNavController().navigate(R.id.action_eliminarFragment_to_FirstFragment)
        }

        binding.butEliminaN.setOnClickListener {
            binding.mensaje6.setText("Nota eliminada X");
            binding.mensaje6.setVisibility(View.VISIBLE);
        }

        binding.mensaje6.setOnClickListener {

            binding.mensaje6.setVisibility(View.INVISIBLE);
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}