import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-usuario-no-registrado')
export class VistaUsuarioNoRegistrado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: fixed; overflow-y: auto;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="layoutCabecera" style="align-self: stretch; align-items: flex-start; flex-shrink: 0; "></vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="align-self: stretch; flex-grow: 1; position:fixed; width: 100%; margin-top: 5%; overflow-y: auto; flex-shrink: 0; height: 90%;">
  <vaadin-vertical-layout id="layoutCabeceraTop" style="height: 95%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutListaPublicaciones" style="flex-grow: 1; align-items: center; margin-bottom: var(--lumo-space-xl);"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
