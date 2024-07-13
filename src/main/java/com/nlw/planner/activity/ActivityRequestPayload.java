package com.nlw.planner.activity;

import com.nlw.planner.trip.Trip;

import java.time.LocalDateTime;

public record ActivityRequestPayload(String title, String occurs_at) {
}
