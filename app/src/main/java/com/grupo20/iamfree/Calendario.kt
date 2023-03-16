package com.grupo20.iamfree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.grupo20.iamfree.databinding.FragmentCalendarioBinding
import com.grupo20.iamfree.databinding.FragmentThirdBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [Calendario.newInstance] factory method to
 * create an instance of this fragment.
 */
class Calendario : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentCalendarioBinding? = null
    private val binding get() = _binding!!

       override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
           _binding = FragmentCalendarioBinding.inflate(inflater, container, false)
           return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.butBack5.setOnClickListener {
            findNavController().navigate(R.id.action_calendario_to_FirstFragment)
        }

        binding.but1.setOnClickListener {
            findNavController().navigate(R.id.action_calendario_to_lunesFragment4)
        }

        binding.but7.setOnClickListener {
            findNavController().navigate(R.id.action_calendario_to_lunesFragment4)
        }

        binding.but2.setOnClickListener {
            findNavController().navigate(R.id.action_calendario_to_lunesFragment4)
        }
        binding.but3.setOnClickListener {
            findNavController().navigate(R.id.action_calendario_to_lunesFragment4)
        }
        binding.but4.setOnClickListener {
            findNavController().navigate(R.id.action_calendario_to_lunesFragment4)
        }
        binding.but5.setOnClickListener {
            findNavController().navigate(R.id.action_calendario_to_lunesFragment4)
        }
        binding.but6.setOnClickListener {
            findNavController().navigate(R.id.action_calendario_to_lunesFragment4)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}