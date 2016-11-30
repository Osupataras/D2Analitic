package com.osypchuk.taras.d2a.model.ApiModelMatchHistory;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Taras on 27.11.2016.
 */

public class Result {

    @SerializedName("status")
    private String status;
    @SerializedName("num_results")
    private String numResults;
    @SerializedName("total_results")
    private String totalResults;
    @SerializedName("results_remaining")
    private String resultsRemainig;
    @SerializedName("matches")
    private List<Matches> matches;

    public Result(List<Matches> matches, String numResults, String resultsRemainig, String status, String totalResults) {
        this.matches = matches;
        this.numResults = numResults;
        this.resultsRemainig = resultsRemainig;
        this.status = status;
        this.totalResults = totalResults;
    }

    public List<Matches> getMatches() {
        return matches;
    }

    public void setMatches(List<Matches> matches) {
        this.matches = matches;
    }

    public String getNumResults() {
        return numResults;
    }

    public void setNumResults(String numResults) {
        this.numResults = numResults;
    }

    public String getResultsRemainig() {
        return resultsRemainig;
    }

    public void setResultsRemainig(String resultsRemainig) {
        this.resultsRemainig = resultsRemainig;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    @Override
    public String toString() {
        return "Result{" +
                " status='" + status + '\'' +
                ", numResults='" + numResults + '\'' +
                ", totalResults='" + totalResults + '\'' +
                ", resultsRemainig='" + resultsRemainig + '\'' +
                ", matches=" + matches +
                '}';
    }
}
