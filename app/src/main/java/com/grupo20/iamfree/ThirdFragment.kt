package com.grupo20.iamfree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.grupo20.iamfree.databinding.FragmentFirstBinding
import com.grupo20.iamfree.databinding.FragmentThirdBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ThirdFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThirdFragment : Fragment() {
    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       binding.butBack2.setOnClickListener {
           findNavController().navigate(R.id.action_thirdFragment_to_FirstFragment)
        }

        binding.butGrabar2.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_grabar2Fragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}