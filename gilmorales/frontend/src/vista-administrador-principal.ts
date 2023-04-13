import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="layoutCabeceraAdmin" style="margin: var(--lumo-space-s); width: 100%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: flex-start; width: 100%; height: 100%; margin: var(--lumo-space-s);">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="margin: var(--lumo-space-m); width: 10%; flex-grow: 0; height: 60%; align-self: flex-start;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutPublicaciones" style="height: 90%; margin: var(--lumo-space-m); flex-grow: 1; width: 60%; align-items: flex-start;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
