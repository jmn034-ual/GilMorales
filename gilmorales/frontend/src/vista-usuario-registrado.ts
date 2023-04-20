import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-usuario-registrado')
export class VistaUsuarioRegistrado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: fixed; overflow-y: auto;" id="vaadinVerticalLayout" theme="spacing-xs">
 <vaadin-horizontal-layout theme="spacing" id="cabecera" style="align-self: stretch; align-items: flex-start; flex-shrink: 0; "></vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="align-self: stretch; flex-grow: 1; position:fixed; width: 100%; margin-top: 5%; overflow-y: auto; flex-shrink: 0; height: 90%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout id="cabeceraTop" style="height: 95%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="listaPublicaciones" style="flex-grow: 1; align-items: center; margin-bottom: var(--lumo-space-xl); flex-shrink: 0;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
