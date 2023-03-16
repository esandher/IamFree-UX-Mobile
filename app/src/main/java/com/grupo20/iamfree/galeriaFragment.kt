package com.grupo20.iamfree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.grupo20.iamfree.databinding.FragmentGaleriaBinding
import com.grupo20.iamfree.databinding.FragmentThirdBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [galeriaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class galeriaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentGaleriaBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGaleriaBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.butBack11.setOnClickListener {
            findNavController().navigate(R.id.action_galeriaFragment_to_SecondFragment)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}