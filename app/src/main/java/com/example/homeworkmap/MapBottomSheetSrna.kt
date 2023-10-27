package com.example.homeworkmap

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homeworkmap.databinding.DialogueMapSrnaBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MapBottomSheetSrna: BottomSheetDialogFragment(){
    private lateinit var binding : DialogueMapSrnaBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogueMapSrnaBinding.inflate(inflater , container, false)
        return binding.root
    }
}