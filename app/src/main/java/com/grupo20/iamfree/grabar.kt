package com.grupo20.iamfree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.grupo20.iamfree.databinding.FragmentGrabarBinding
import com.grupo20.iamfree.databinding.FragmentPantallaBinding

/**
 * A simple [Fragment] subclass.
 * Use the [grabar.newInstance] factory method to
 * create an instance of this fragment.
 */
class grabar : Fragment() {
    private var _binding: FragmentGrabarBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGrabarBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}