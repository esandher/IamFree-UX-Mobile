package com.grupo20.iamfree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.grupo20.iamfree.databinding.FragmentFileBinding
import com.grupo20.iamfree.databinding.FragmentThirdBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [FileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FileFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentFileBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFileBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.butBack8.setOnClickListener {
            findNavController().navigate(R.id.action_fileFragment_to_guardarrFragment)
        }

        binding.butPausa3.setOnClickListener {
            binding.mensaje4.setText("Nota pausada X");
            binding.mensaje4.setVisibility(View.VISIBLE);
        }

        binding.mensaje4.setOnClickListener {

            binding.mensaje4.setVisibility(View.INVISIBLE);
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}