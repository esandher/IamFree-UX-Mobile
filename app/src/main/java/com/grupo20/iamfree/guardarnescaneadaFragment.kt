package com.grupo20.iamfree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.grupo20.iamfree.databinding.FragmentGuardarnescaneadaBinding
import com.grupo20.iamfree.databinding.FragmentGuardarrBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [guardarnescaneadaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class guardarnescaneadaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentGuardarnescaneadaBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGuardarnescaneadaBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.butBack10.setOnClickListener {
            findNavController().navigate(R.id.action_guardarnescaneadaFragment_to_SecondFragment)
        }
        binding.butSave2.setOnClickListener {
            binding.mensaje7.setText("Nota guardada X");
            binding.mensaje7.setVisibility(View.VISIBLE);
        }

        binding.mensaje7.setOnClickListener {

            binding.mensaje7.setVisibility(View.INVISIBLE);
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}