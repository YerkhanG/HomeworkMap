package com.example.homeworkmap

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homeworkmap.databinding.DialogueMapAdasBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MapBottomSheetAdas : BottomSheetDialogFragment(){
    private lateinit var binding : DialogueMapAdasBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogueMapAdasBinding.inflate(inflater , container, false)
        return binding.root
    }
}