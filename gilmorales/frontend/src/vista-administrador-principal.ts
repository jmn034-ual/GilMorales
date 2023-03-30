import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-administrador-principal')
export class VistaAdministradorPrincipal extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <vaadin-horizontal-layout theme="spacing" id="layoutCabeceraAdmin" style="margin: var(--lumo-space-s); width: 100%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start; width: 100%; height: 100%; margin: var(--lumo-space-s);">
  <vaadin-vertical-layout theme="spacing" style="height: 90%; margin: var(--lumo-space-m); width: 30%; flex-grow: 0;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; height: 8%;">
    <h2>Top usuarios</h2>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 90%; margin: var(--lumo-space-xs); align-self: center; height: 35%; flex-grow: 0;"></vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 100%; justify-content: center;">
    <h2>Top Hashtags</h2>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 90%; flex-grow: 1; height: 35%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="height: 90%; margin: var(--lumo-space-m); flex-grow: 1; width: 60%;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
