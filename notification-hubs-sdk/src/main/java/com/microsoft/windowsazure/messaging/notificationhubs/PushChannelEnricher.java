package com.microsoft.windowsazure.messaging.notificationhubs;

public class PushChannelEnricher implements InstallationEnricher {
    private String mChannel;

    public PushChannelEnricher() {
        // Intentionally Left Blank
    }

    public PushChannelEnricher(String pushChannel) {
        mChannel = pushChannel;
    }

    /**
     * Updates an {@link Installation} with the unique identifier that marks this device for
     * notification delivery purposes.
     * @param subject The {@link Installation} that should be modified to include more detail.
     */
    @Override
    public void enrichInstallation(Installation subject) {
        subject.setPushChannel(mChannel);
    }

    /**
     * Updates the unique identifier that will be applied to future {see enrichInstallation} calls.
     * @param channel The new unique identifier to apply.
     */
    public void setPushChannel(String channel) {
        this.mChannel = channel;
    }

    /**
     * Fetches the current Push Channel.
     * @return The current string that identifies this device as Push notification receiver. Null if
     *         it hasn't been initialized yet.
     */
    public String getPushChannel() {
        return this.mChannel;
    }
}